# ChatCat Example (German translation below)

Installation instructions:

## Linux
These instructions are for Linux-Systems (concretely: Ubuntu 20.04 or higher).

In order to run this example, make sure the VOnDA compiler is available in `../vonda/compile`.
Adapt `compile` in the root directory if required.

The example can now be build as follows:

```
# generate .java files from the .rudi source files
./compile
# compile the .java files into an executable .jar
mvn install
# start the mini-GUI
./openGui
# type e.g. "Hello" into the text input field or simply wait
```
**Attention:** Make sure to **not** run `mvn clean install`, as this would delete the generated Java files!

# ChatCat Beispiel

Installationsanleitung:

## Linux
Diese Anleitung ist für Linux-Systeme (konkret: Ubuntu 20.04 oder
höher) geschrieben.

Um dieses Beispiel laufen zu lassen, bitte sicherstellen, dass der VOnDA Compiler in `../vonda/compile` verfügbar ist.
Bitte `compile` im Wurzelverzeichnis anpassen falls nötig.

Das Beispiel kann jetzt folgendermaßen gebaut und gestartet werden

```
# generiere die .java aus den .rudi Dateien
./compile
# uebersetze die .java Dateien zu einer ausführbaren .jar
mvn install
# Mini-GUI starten
./openGui
# z.B. "Hello" in das Textfeld eintippen oder einfach warten
```
**Achtung:** Nicht `mvn clean install` verwenden, da sonst die generierten Java Dateien wieder gelöscht werden!