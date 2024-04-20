
1. **Interface für eine bedingte Ausgabe**
    - Definiere ein funktionales Interface, das zwei `int` Werte akzeptiert und abhängig von einer Bedingung eine der beiden Zahlen zurückgibt.
    - Implementiere das Interface mit einem Lambda, das die größere der beiden Zahlen zurückgibt.

2. **Interface für eine String-Verarbeitung**
    - Definiere ein funktionales Interface, das einen String akzeptiert und einen String zurückgibt.
    - Implementiere das Interface mit einem Lambda, das den Eingabe-String umdreht.

3. **Interface für das Zusammenführen von Strings**
    - Definiere ein funktionales Interface, das zwei Strings akzeptiert und einen String zurückgibt.
    - Implementiere das Interface mit einem Lambda, das die beiden Strings verbindet.

4. **Interface zur Berechnung der Differenz**
    - Definiere ein funktionales Interface, das zwei `double` Werte akzeptiert und ihre Differenz zurückgibt.
    - Implementiere das Interface mit einem Lambda, das die Differenz der beiden Werte berechnet.

5. **Interface zur Entscheidungsfindung**
    - Definiere ein funktionales Interface, das einen `boolean` Wert akzeptiert und einen `String` zurückgibt.
    - Implementiere das Interface mit einem Lambda, das abhängig vom `boolean` Wert unterschiedliche Nachrichten zurückgibt.

6. **Interface zur Multiplikation**
    - Definiere ein funktionales Interface, das drei `int` Werte akzeptiert und ihr Produkt zurückgibt.
    - Implementiere das Interface mit einem Lambda, das die drei Zahlen multipliziert.

7. **Interface zur Textanalyse**
    - Definiere ein funktionales Interface, das einen String akzeptiert und einen `int` zurückgibt.
    - Implementiere das Interface mit einem Lambda, das die Länge des Strings zurückgibt.

8. **Interface zur Indexsuche**
    - Definiere ein funktionales Interface, das einen String und ein Zeichen akzeptiert und einen `int` zurückgibt.
    - Implementiere das Interface mit einem Lambda, das den Index des Zeichens im String findet.

9. **Interface zur Berechnung des Mittelwerts**
    - Definiere ein funktionales Interface, das drei `double` Werte akzeptiert und ihren Mittelwert zurückgibt.
    - Implementiere das Interface mit einem Lambda, das den Mittelwert der drei Werte berechnet.

10. **Interface zur Formatierung von Daten**
    - Definiere ein funktionales Interface, das drei `int` Werte akzeptiert und einen formatierten String zurückgibt.
    - Implementiere das Interface mit einem Lambda, das die drei Zahlen in einem speziellen Format, z.B. `"Ergebnis: A, B, C"`, zurückgibt.

### Programmieraufgabe: Die Radargesteuerte Fahrzeug-Simulation

**Hintergrundgeschichte:**

In einer nahen Zukunft hat sich die Fahrzeugtechnologie weit über das heute Bekannte hinaus entwickelt. Eine Stadt, bekannt für ihre Innovationsfreude in der Autonomieforschung, initiiert ein großangelegtes Projekt zur Entwicklung und Simulation autonomer Fahrzeuge. Diese Fahrzeuge sind mit hochentwickelten Radarsystemen ausgestattet, die es ihnen ermöglichen, Hindernisse zu erkennen und entsprechend zu reagieren. Sie, ein aufstrebender Software-Ingenieur, sind eingeladen, an diesem spannenden Projekt teilzunehmen und Ihre Fähigkeiten unter Beweis zu stellen.

**Aufgabenstellung:**

Sie sollen ein Simulationsprogramm entwickeln, das ein autonomes Fahrzeug auf einer geraden Teststrecke darstellt. Dieses Fahrzeug ist mit einem Radar ausgestattet, das Hindernisse auf der Strecke erkennen kann. Ihre Hauptaufgabe ist es, das Fahrzeug so zu programmieren, dass es auf erkannte Hindernisse reagiert, indem es die Spur wechselt, um Kollisionen zu vermeiden.

**Spezifische Herausforderungen:**

1. **Einlesen der Hindernisdaten:**
   - Die Teststrecke enthält verschiedene Hindernisse, deren Positionen vorab in einer CSV-Datei gespeichert sind. Jedes Hindernis ist durch seine x- und y-Koordinaten definiert, wobei die y-Koordinate angibt, auf welcher Spur das Hindernis liegt (negativ für links und positiv für rechts).
   - Ihre erste Aufgabe besteht darin, ein Programmteil zu schreiben, das diese CSV-Datei liest und die Hindernisdaten für die Simulation vorbereitet.

2. **Radarerkennung:**
   - Das Radar des Fahrzeugs kann Hindernisse bis zu einer Entfernung von 80 Metern erkennen. Entwickeln Sie eine Komponente, die ständig die Umgebung des Fahrzeugs überwacht und prüft, ob ein Hindernis innerhalb dieser Reichweite liegt.

3. **Reaktionsmechanismus:**
   - Wenn ein Hindernis erkannt wird und sich das Fahrzeug diesem auf weniger als 20 Meter nähert, muss das Fahrzeug die Spur wechseln. Entwickeln Sie die Logik, die bestimmt, wann und wie das Fahrzeug reagieren soll, um einen Zusammenstoß zu vermeiden.

**Erwartungen an die Lösung:**

- Die Lösung sollte in Form eines Konzepts oder eines Flussdiagramms dargestellt werden, das die Hauptkomponenten des Systems und ihre Interaktionen beschreibt.
- Erklären Sie, wie die Daten gelesen und verarbeitet werden, wie das Radar funktioniert und wie das Fahrzeug auf erkannte Hindernisse reagiert.
- Die Beschreibung sollte ausreichend detailliert sein, um die Logik hinter den Entscheidungen und den Algorithmen zu verstehen.

**Ziel der Aufgabe:**

Diese Aufgabe soll Ihre Fähigkeiten in der Softwareentwicklung für autonome Systeme testen. Sie benötigen ein gutes Verständnis für Algorithmen, Datenverarbeitung und ereignisgesteuerte Programmierung. Nehmen Sie diese Herausforderung an, um Ihre technischen Fähigkeiten zu demonstrieren und möglicherweise einen Beitrag zur Zukunft der autonomen Fahrzeuge zu leisten.

**Hinweise**
Für die Simulation ist ein `loop` zu schreiben, welcher pro Durchlauf eine Sekunde beschreibt. D.h. wenn das 
Fahrzeug mit einer Geschwindigkeit von v = 5km/h fährt, so hat es nach 5 Durchläufen eine Strecke von s = v * t
durchlaufen. Im Beispiel sind es dann s = 5km/h * 5 Sekunden => 5km/h / 3,6 * 5s = 1,39 * 5 = 6,95m.

So könnte die Hindernisdatei aussehen.
```csv
x,y
100,-15
250,20
375,-10
520,25
```