# Tugas Akhir PBO
# Sistem Input Nilai Mahasiswa
> Sistem dapat digunakan untuk perekaman data nilai mahasiswa, dimana terdapat 2 jenis nilai yaitu nilai dari dosen dan nilai praktikum.

MOHAMMAD FAJAR 1917051014 - MEMBUAT ER DIAGRAM & CLASS DATA MODEL
FIKRI ASLAM TAUFIQURRAHMAN 1917051025 - MEMBUAT PROGRAM
TEGAR JAYANAGA 1917051071 - MEMBUAT CLASS DIAGRAM & CLASS CONTROLLER

### Design Class Diagram for JavaFX and Database

```mermaid
classDiagram
    Nilai <|-- NilaiPraktikum
    Nilai <|-- NilaiDosen
    Nilai o-- NilaiDataModel : Data Modeling
    DesainController --> NilaiDataModel : Data Control
    NilaiDataModel --> DBHelper : DB Connection
    DesainController <.. Desain : Form Control

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
        InputNilai()
        getNilaiDosenbaru()
        getNilaiAsdosbaru()
    }
    class DesainController{
        initialize()
        handleInput()
        handleInput2()
    }
    class DBHelper{
        - String USER
        - String PASSWORD
        - String DB
        getConnection()
    }
```
### ER Diagram

            
