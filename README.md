
<div align="center">

# Lucky Guy for Java!
[![Basic validation](https://github.com/actions/labeler/actions/workflows/basic-validation.yml/badge.svg?branch=main)](https://github.com/actions/labeler/actions/workflows/basic-validation.yml)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.matheusmfranco/LuckyGuy4J/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.matheusmfranco/LuckyGuy4J)


LuckyGuy4J is a game utility library that includes features such as rolling dice, flipping coins, binary outcomes, custom games, and more.

This library allows you to set a default language and supports multiple languages for game results.
</div>

## Supported Languages
The library supports the following languages:
- **en** (English)
- **pt** (Portuguese)
- **es** (Spanish)
- **fr** (French)
- **de** (German)
- **it** (Italian)

## Importing in Maven
To use the `LuckyGuy4J` library in your Maven project, add the following dependency to your `pom.xml` file:

```xml
<dependency>
    <groupId>io.github.matheusmfranco</groupId>
    <artifactId>LuckyGuy4J</artifactId>
    <version>${luckyguy.version}</version>
</dependency>
```
[Click here to know the current version](https://central.sonatype.com/artifact/io.github.matheusmfranco/LuckyGuy4J).


## Main Features
### 1. Binary Outcome
Plays a binary game, returning either 1 or 2.

```java
LuckyGuy luckyGuy = new LuckyGuy();
int result = luckyGuy.binary();
System.out.println(result); // Example output: 1 or 2
```

### 2. Roll a Dice
Rolls a die with a specified number of sides (default is 6).

```java
int diceResult = luckyGuy.dice(6);
System.out.println(diceResult); // Example output: 3
```

### 3. Flip a Coin
Flips a coin and returns the result in the defined language.

```java
String coinResult = luckyGuy.coin();
System.out.println(coinResult); // Example output: "Heads" or "Tails"
```

### 4. Yes or No Confirmation
Returns "Yes" or "No" in the defined language.

```java
String confirmation = luckyGuy.confirmation();
System.out.println(confirmation); // Example output: "Yes" or "No"
```

### 5. Rock, Paper, Scissors
Plays rock-paper-scissors and returns the result.

```java
String jokenpoResult = luckyGuy.jokenpo();
System.out.println(jokenpoResult); // Example output: "Rock", "Paper", or "Scissors"
```

### 6. Random Letter
Returns a random letter from the alphabet.

```java
String randomLetter = luckyGuy.alphabet();
System.out.println(randomLetter); // Example output: "A"
```

### 7. Odds or Evens
Plays "Odds or Evens" using the provided hand values.

```java
String oddsAndEvensResult = luckyGuy.oddsAndEvens(3, 4);
System.out.println(oddsAndEvensResult); // Example output: "Even"
```

### 8. Custom Game
Create your own game with a custom list of options.

```java
List<String> options = Arrays.asList("Option 1", "Option 2", "Option 3");
String customResult = luckyGuy.custom(options);
System.out.println(customResult); // Example output: "Option 1"
```

## Usage Example
```java
public class Main {
    public static void main(String[] args) {
        LuckyGuy luckyGuy = new LuckyGuy(Locale.of("pt")); //Set portuguese language
        System.out.println("Zerinho ou Um: " + luckyGuy.binary()); // Example output: "1"
        System.out.println("Moeda: " + luckyGuy.coin()); // Example output: "Cara"
        System.out.println("Stop!: " + luckyGuy.alphabet()); // Example output: "M"
    }
}
```

## Typescript Version
If you want this library on your frontend side, check it out: [super-lucky-guy](https://www.npmjs.com/package/super-lucky-guy)!