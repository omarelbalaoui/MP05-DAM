# Activitats: 

Per dibuixar els diagrames de flux podeu fer servir [draw.io](https://draw.io) o qualsevol altra eina online.

1. Calcula el CC de les següents figures:
  - ![image](https://user-images.githubusercontent.com/110727546/204613022-4ab64342-2e06-438d-a7e8-570685b3c406.png)
  - ![image](https://user-images.githubusercontent.com/110727546/204613180-6d55bf09-28b8-417e-96f4-f71a762ac44c.png)
  - ![image](https://user-images.githubusercontent.com/110727546/204655229-8c3f28d7-3d8b-4746-a55d-331f89da39d2.png)

  - **Resultat 1:** 16-14+2=4
  - **Resultat 2:** 16-14+2=4
  - **Resultat 3:** 8-6+2=4


2. Dibuixa el diagrama de flux representat per aquest codi i després calcula la seva CC:
  - ![image](https://user-images.githubusercontent.com/110727546/204615125-363e5e6c-173b-4ec0-8c0b-cb97985ade06.png)

  - **Diagrama:![image](https://user-images.githubusercontent.com/82141541/204740189-7b5790ec-e0a4-40f9-9e2b-acc7f9473a44.png)
  - **Resultat CC:** 2+1=3

3. Dibuixa el diagrama de flux representat per aquest codi i després calcula la seva CC:

```
public class proves {
    public static  String queEmPoso(int temperatura) {
        String roba = "res";
        if(temperatura<0){
           roba = "roba d'esquiar";
        }
        else if(temperatura<10){
           roba = "roba de muntanya";
        }
        else if(temperatura<20){
           roba = "roba d'hivern";
        }
        else if(temperatura<30){
           roba = "roba d'estiu";
        }
        return roba;
    }    
}
```

  - **Diagrama:**![image](https://user-images.githubusercontent.com/82141541/204749543-3edaaa33-834a-4250-bf7f-4a50e1e531b9.png)
  - **Resultat CC:** 4+1=5
  - **Casos Posibles:** T=-2 Roba=Roba Esquiar, T=9 Roba=Roba Muntanya, T=16 Roba=Roba Hivern, T=25 Roba Estiu
                       

4. Dibuixa el diagrama de flux representat per aquest codi, calcula la seva CC i crea una prova per a cada camí posible:

```
    public static Boolean llumsEncesos(int hora) {
        Boolean llums = false;
        if(hora <= 8 || hora >= 20){
            llums = true;
        }
        return llums;
    }
```
  - **Diagrama:**![image](https://user-images.githubusercontent.com/82141541/204750187-b9a4df4b-f8e1-4dd9-8ca5-6283d96221a7.png)
  - **Resultat CC:** 2+1=3
  - **Resultat proves camins:** Hora=6 Llums=true, Hora=23 Llums=true, Hora=10 Llums=false

5. Investiga sobre les proves de caixa negra:

  - Què són?
  	- Aquest a diferencia de les de caixa blanca, l'evaluador o programador desconeix l'estructura o diseny intern del programa o 
  	element amb el que s'esta fent proves.
  
  - Quina diferència principal tenen sobre les de caixa blanca?
	- Es desconeix l'estructura del programa.
	- Es una prova funcional del programa a diferencia de la blanca que es estructural.
	- ES pot dur a terme mitjançant metodes de prova/error.
