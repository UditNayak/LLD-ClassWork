# Stone Game — Factory Method

## Game Story (extended)
- The player still needs to avoid **falling stones** (Small, Medium, Large).
- Each stone has **size**, **damage**, and **weight**.
- But now, stones don’t just appear one by one — they appear in **waves**.

### What is a wave?
- A wave is a group of stones that appear together in the game.
- Example: A wave of 5 stones could be [Small, Large, Medium, Small, Medium].

## New Problem
- We need different **policies** for how stones are chosen in a wave:
  1. **Random Policy** → Stones appear in random sizes.
     - Example: [Small, Large, Medium, Small, Large]
  2. **Equalized Policy** → Stones appear in equal numbers (round-robin style).
     - Example: [Small, Medium, Large, Small, Medium]

- The **wave generation algorithm** is the same:
  - For each stone in the wave → **create a stone**.
  - But **which stone** is chosen depends on the **policy**.

## Why Simple Factory is not enough
- Simple Factory can only create **one stone at a time** when asked.
- It does not control the **policy** of how multiple stones should appear in sequence.
- We need a way to:
  - Keep the wave algorithm **fixed**.
  - Allow different policies to decide **which stone** to create.

## Our goal (Factory Method)
- Put the **wave generation algorithm** in a base class.
- Let subclasses provide their own version of `createStone()`:
  - Random policy chooses randomly.
  - Equalized policy chooses in a cycle (Small → Medium → Large → repeat).
- This follows the **Factory Method pattern**:
  - Algorithm is fixed.
  - The “factory method” (`createStone`) is different for each subclass.

## What we will build
- Use the same `IStone`, `SmallStone`, `MediumStone`, `LargeStone` from before.
- Add an abstract class `StoneCreator`:
  - Has a fixed method `generateWave(int count)`.
  - Calls an abstract method `createStone()` (the factory method).
- Add concrete creators:
  - `RandomStoneCreator`
  - `EqualizedStoneCreator`
- A `Demo` program to show how waves look with each policy.

## Folder plan
```
StoneGame/
    FactoryMethod/
        README.md
        src/
            IStone.java
            StoneType.java
            SmallStone.java
            MediumStone.java
            LargeStone.java
            StoneCreator.java
            RandomStoneCreator.java
            EqualizedStoneCreator.java
            Demo.java
```

## Output

```shell
Random Wave: [LARGE, LARGE, MEDIUM, SMALL, MEDIUM, LARGE, SMALL, MEDIUM, LARGE]
Equalized Wave: [SMALL, MEDIUM, LARGE, SMALL, MEDIUM, LARGE, SMALL, MEDIUM, LARGE]
```

In future if we want to add a new policy (e.g `HeavyStoneCreator` that prefers larger stones), we just create a new subclass of `StoneCreator` without changing existing code. This follows the Open/Closed Principle and demonstrates the power of the Factory Method pattern.