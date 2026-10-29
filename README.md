# Java Practice Examples

Standalone Java examples and exercises organized by chapter. Each `.java` file is a self-contained program (no packages, no build tool). Compile and run a single file from its chapter folder.

## Requirements

- JDK 8 or later
- A terminal with `javac` and `java` on the `PATH`

## How to run

From a chapter directory:

```bash
cd Chapter2
javac Hello.java   # or any example file
java Hello
```

Some programs take command-line arguments. For example:

```bash
cd Chapter11
javac CalendarEx7.java
java CalendarEx7 2005 11
```

AWT examples in `Chapter13` open a GUI window. Network examples in `Chapter15` expect a matching client and server to be started together.

## Contents

| Folder | Topics |
| --- | --- |
| `Hello.java` | First "Hello, world" program |
| `Chapter2` | Types, casting, characters |
| `Chapter3` | Operators |
| `Chapter4` | Conditionals and loops |
| `Chapter5` | Arrays |
| `Chapter6` | Classes, methods, constructors |
| `Chapter7` | Inheritance, polymorphism, interfaces |
| `Chapter8` | Exceptions |
| `Chapter9` | `java.lang` utilities |
| `Chapter10` | Inner classes |
| `Chapter11` | Collections, dates, formatting, scanners |
| `Chapter12` | Threads |
| `Chapter13` | AWT GUI and events |
| `Chapter14` | File I/O and serialization |
| `Chapter15` | TCP/UDP networking |
| `Appendix` | Enums, varargs, static imports |

## Notes

- Most classes are package-private and named after the file (`class ThreadEx1` in `ThreadEx1.java`).
- A few examples read local data files such as `Chapter11/scoreData.txt` and `Chapter11/data4.txt`. Run those from the same directory as the data file.
- Compiled `.class` files and generated I/O artifacts are ignored by Git.
