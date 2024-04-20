
```java
// 1. Interface für eine bedingte Ausgabe
interface ConditionalOutput {
    int choose(int a, int b);
}
ConditionalOutput maxNumber = (a, b) -> a > b ? a : b;

// 2. Interface für eine String-Verarbeitung
interface StringProcessor {
    String process(String input);
}
StringProcessor reverseString = s -> new StringBuilder(s).reverse().toString();

// 3. Interface für das Zusammenführen von Strings
interface StringMerger {
    String merge(String s1, String s2);
}
StringMerger concatenateStrings = (s1, s2) -> s1 + s2;

// 4. Interface zur Berechnung der Differenz
interface DifferenceCalculator {
    double difference(double a, double b);
}
DifferenceCalculator calculateDifference = (a, b) -> a - b;

// 5. Interface zur Entscheidungsfindung
interface DecisionMaker {
    String decide(boolean condition);
}
DecisionMaker showMessage = condition -> condition ? "Wahr" : "Falsch";

// 6. Interface zur Multiplikation
interface Multiplier {
    int multiply(int a, int b, int c);
}
Multiplier multiplyThreeNumbers = (a, b, c) -> a * b * c;

// 7. Interface zur Textanalyse
interface TextAnalyzer {
    int analyze(String text);
}
TextAnalyzer getLength = String::length;

// 8. Interface zur Indexsuche
interface IndexFinder {
    int findIndex(String s, char c);
}
IndexFinder findCharacterIndex = (s, c) -> s.indexOf(c);

// 9. Interface zur Berechnung des Mittelwerts
interface AverageCalculator {
    double calculateAverage(double a, double b, double c);
}
AverageCalculator findAverage = (a, b, c) -> (a + b + c) / 3;

// 10. Interface zur Formatierung von Daten
interface DataFormatter {
    String format(int a, int b, int c);
}
DataFormatter formatData = (a, b, c) -> String.format("Ergebnis: %d, %d, %d", a, b, c);
```

Jede Lösung definiert ein Interface und ein Lambda, das dieses Interface implementiert. Diese Beispiele zeigen, wie du benutzerdefinierte Funktionen erstellen kannst, die für spezifische Aufgaben wie String-Verarbeitung, Entscheidungsfindung oder mathematische Operationen verwendet werden können.