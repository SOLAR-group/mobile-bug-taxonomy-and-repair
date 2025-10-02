## From Kotlin to Swift and Back: Toward Fully Automated Cross-Language Code Transpilation

This repository constitues the artefact of the A-Mobile 2025 publication titled: "From Kotlin to Swift and Back: Toward Fully Automated Cross-Language Code Transpilation" by Sachi Lad, Carol Hanna, and Justyna Petke.

## Organisation of Code

### InputTestCode

Contains the input test code used for the study.

```
└──InputTestCode/
    ├── Kotlin/
    │   ├── KotlinBasics 
    │   ├── SwiftTour
    └── Swift/
        ├── KotlinBasics
        ├── SwiftTour
```
### CodeLlamaTranspiledCode

Contains the transpiled code of the input test code using CodeLlama.

### SequalsKTranspiledCode

Contains the transpiled code of the input test code using SequalsK.

### OllamaRequestCode

Contains the Python scripts used to make requests to Ollama to access CodeLlama via the API.

```
└── OllamaRequestCode/
    ├── kotlin_to_swift.py
    └── swift_to_kotlin.py
```

### LLMBugFixing

Contains the Python script used to prompt CodeLlama to fix bugs in the broken transpilations. 
