# Tugas-Akhir-PBO
# MOHAMMAD FAJAR 1917051014 - MEMBUAT ER DIAGRAM & CLASS DATA MODEL
# FIKRI ASLAM TAUFIQURRAHMAN 1917051025 - MEMBUAT PROGRAM
# TEGAR JAYANAGA 1917051071 - MEMBUAT CLASS DIAGRAM & CLASS CONTROLLER

### Class Diagram

```mermaid
classDiagram
    Nilai <|-- NilaiPraktikum
    Nilai <|-- NilaiDosen
    Nilai o-- NilaiDataModel : Data Modeling
    DesainController --> NilaiDataModel
    DesainController <.. FormNilai

    class Nilai{
        <<abstract>>
        #IntegerProperty npm
        #StringProperty nama
        #StringProperty mk
        #DoubleProperty nilai
    }
    class NilaiPraktikum{
        -StringProperty asdos
    }
    class NilaiDosen{
        -StringProperty dosen
    }
    class NilaiDataModel{
        Connection con
        +void Input()
        +void InputNilai()
    }
    class DesainController{
    
    }
```
### ER Diagram

            
