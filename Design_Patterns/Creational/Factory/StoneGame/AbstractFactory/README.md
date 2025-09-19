# Stone Game — Abstract Factory

## Game Story (extended again)
- The player still avoids falling stones.
- Stones can be **Small**, **Medium**, or **Large**.
- Stones appear in **waves** (like in Factory Method).
- But now, the game world has different **themes**:
  - **Volcano Theme** → Stones look like lava/rock.
  - **Ice Theme** → Stones look like frozen ice.
  - **Forest Theme** → Stones look like wood/moss.

### What does this mean?
- Each theme has its **own version** of Small, Medium, and Large stones.
- Example:
  - ForestSmallStone, ForestMediumStone, ForestLargeStone
  - VolcanoSmallStone, VolcanoMediumStone, VolcanoLargeStone
  - IceSmallStone, IceMediumStone, IceLargeStone
- A wave must be **consistent**: if the player is in the Forest world,
  then all stones in that wave should come from the Forest family.
- We should **not accidentally mix** a ForestSmallStone with a VolcanoMediumStone.

---

## Step 1: Without Abstract Factory
How would we solve this problem **without** Abstract Factory?

- A simple approach is to put all theme-handling logic into a **StoneThemeFactory**:
  - If theme = Forest → return `ForestSmallStone`, `ForestMediumStone`, etc.
  - If theme = Volcano → return `VolcanoSmallStone`, `VolcanoMediumStone`, etc.
  - If theme = Ice → return `IceSmallStone`, `IceMediumStone`, etc.
- The **StoneCreator** classes (Random, Equalized) use this factory to build waves.

### Problem with this approach
- All themes are hardcoded in **StoneThemeFactory**.
- If we add a new theme (say "Ocean"), we must **edit StoneThemeFactory** and add more `if/switch` cases.
- This breaks the **Open/Closed Principle**:
  - The code should be open to extension (adding new themes),
  - but closed to modification (existing logic should not need changes).
- The result is **less maintainable and less scalable** code.

---

## Step 2: With Abstract Factory
How does Abstract Factory solve this problem?

- Instead of one big `StoneThemeFactory`, we split the logic into **separate factories**:
  - `ForestStoneFactory` → makes ForestSmall, ForestMedium, ForestLarge.
  - `VolcanoStoneFactory` → makes VolcanoSmall, VolcanoMedium, VolcanoLarge.
  - `IceStoneFactory` → makes IceSmall, IceMedium, IceLarge.
- Each factory implements a common interface `IStoneFactory`:
  - `createSmall()`
  - `createMedium()`
  - `createLarge()`
- The **wave creation code** only depends on `IStoneFactory`.
- When we add a new theme (for example, Ocean), we just create `OceanStoneFactory` and new stone classes.  
  No changes are needed in existing code.

### Benefits
- No giant `if/switch` statements.
- Each theme is self-contained in its own factory.
- Easy to add new themes without touching existing code.
- Clean separation of **wave policy** (Random, Equalized) and **theme family** (Forest, Volcano, Ice).

---

## Our goal
- Extend the game to support **themes**.
- Show the limitations of the approach **without** Abstract Factory.
- Then demonstrate how Abstract Factory provides a clean and scalable solution.

---

## What we will build
1. **Without Abstract Factory**
   - Use a `StoneThemeFactory` with `if/switch` logic.
   - Works, but is messy and not scalable.
2. **With Abstract Factory**
   - Introduce `IStoneFactory`.
   - Implement concrete factories per theme.
   - Wave creation becomes clean and consistent.

---

## Folder plan

```sh
StoneGame/
  AbstractFactory/
    README.md
    WithoutAbstractFactory/
      IStone.java
      ForestSmallStone.java
      ForestMediumStone.java
      ForestLargeStone.java
      VolcanoSmallStone.java
      VolcanoMediumStone.java
      VolcanoLargeStone.java
      IceSmallStone.java
      IceMediumStone.java
      IceLargeStone.java
      StoneThemeFactory.java
      StoneCreator.java
      RandomStoneCreator.java
      EqualizedStoneCreator.java
      WaveLogicWithoutFactory.java
    WithAbstractFactory/
      IStone.java
      IStoneFactory.java
      ForestStoneFactory.java
      VolcanoStoneFactory.java
      IceStoneFactory.java
      StoneCreator.java
      RandomStoneCreator.java
      EqualizedStoneCreator.java
      Demo.java
```