--- Para compilar el archivo es necesario tener Java 21 --- 
1. Entras a la carpeta inicial llamada out hasta encontrar el archivo llamado Tarea1_Nuevo_jar.jar
2. Corres el comando "java -jar Tarea1_Nuevo.jar"
3. Ver los resultados en la terminal

Test Cases

Stack(LIFO):
 - Caso #1: Insertamos [1, 2, 3, 4] con push y verificamos que el ulitmo insertado quede al final.
 - Caso #2: Eliminamos con push hasta vaciar y verificamos que se elimina de final a inicio.

Queue(FIFO):
 - Caso #1: Insertamos [1, 2, 3, 4] con offer y verficiamos que el primero insertado quede al frente.
 - Caso #2: Eliminamos con poll hasta vaciar y verificamos que salgan del mismo orden que entraron, de inicio a fin.

HasMap(Orden): 
 - Caso #1: Insertamos por pares usando put.
 - Caso #2: Accedemos con get para verificar que la llave devuelva el valor correcto.
 - Caso #3: Eliminamos llave 1 con remove y verificamos que ya no exista en el mapa.
 - Caso #4: Confirmamos que el orden se conserve.

 
