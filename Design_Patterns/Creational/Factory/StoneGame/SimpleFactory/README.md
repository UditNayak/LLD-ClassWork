# Stone Game — Simple Factory

## What is the game?
- Imagine a simple action game.
- The **player’s goal** is to avoid getting hit by falling stones.
- Stones can be of different sizes: **Small**, **Medium**, or **Large**.
- Each stone has:
  - a **size**
  - some **damage** value (how much health it removes if it hits the player)
  - a **weight** value (how heavy it is)

During the game, stones keep appearing again and again.  
The player moves left or right to stay safe.

## The problem we want to solve
- To show stones in the game, the code must **create new stone objects** many times.
- Without a factory, we would write things like:
  ```java
  new SmallStone();
  new MediumStone();
  new LargeStone();
  ```
- This is messy and repeated in many places.
- If a new stone type is added later (for example, GiantStone), we would have to edit many files.

## Our goal (Simple Factory)
- Put all stone creation logic in one class (`StoneFactory`).
- Game code should simply ask:
    ```java
    Stone s = StoneFactory.create(StoneType.SMALL);
    ```
- The game does not need to know the real class like `SmallStone` or `MediumStone`.

## Why this helps
- **Cleaner code**: No repeated `new` scattered around.

- **Easy to change**: If a new stone size comes, we only touch the factory.

- **Hides details**: Game logic only knows about the `IStone` interface, not the exact classes.

## Out of scope (not in Simple Factory)

- We are not handling game policies like:
    - "Make stones appear randomly"
    - "Make equal numbers of each stone"
- We only cover making one stone when asked.

## Folder plan
```
StoneGame/
  SimpleFactory/
    README.md   <-- (this file)
    src/
      IStone.java
      StoneType.java
      SmallStone.java
      MediumStone.java
      LargeStone.java
      StoneFactory.java
      Demo.java
```

## Output
```shell
SMALL Stone (damage=5, weight=1.0)
MEDIUM Stone (damage=10, weight=2.5)
LARGE Stone (damage=18, weight=4.0)
```