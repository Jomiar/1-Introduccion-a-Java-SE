# Técnica de Naming: Camel Case
Camel Case es una convención muy popular para nombrar nuestras variables. Podemos usarlo en modo Upper Camel Case o Lower Camel Case, la diferencia es si comenzamos el nombre de la variable con mayúscula o minúscula.

```java
// Upper Camel Case:
class SoyUnaClase {};

// Lower Camel Case
int soyUnNumeroInt = 10;
```
# Tipos de datos muméricos
### Tipos de datos para números enteros (sin decimales):
- **byte**: Ocupa 1 byte de memoria y su rango es de -128 hasta 127.
- **short**: Ocupa 2 bytes de memoria y su rango es de -32,768 hasta 32,727.
- **int**: Ocupa 4 bytes de memoria y su rango es de -2,147,483,648 hasta 2,147,483,647. Es muy cómodo de usar, ya que no es tan pequeño para que no quepan nuestros números ni tan grande como para desperdiciar mucha memoria. Puede almacenar hasta 10 dígitos.
- **long**: Ocupa 8 bytes de memoria y su rango es de -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807. Para diferenciarlo de un tipo de dato long debemos terminar el número con la letra L.

Por ejemplo:
```java
// Int:
int n = 1234567890;

// Long:
long nL = 123456789012345L;
```

### Tipos de datos para números flotantes (con decimales):

- float: Ocupan 4 bytes de memoria y su rango es de 1.40129846432481707e-45 hasta 3.40282346638528860e+38. Así como long, debemos colocar una letra F al final.
- double: Ocupan 8 bytes de memoria y su rango es de 4.94065645841246544e-324d hasta 1.79769313486231570e+308d.
Por ejemplo:
```java
// Double:
double nD = 123.456123456;

// Float
float nF = 123.456F;
```
# Tipos de datos char y boolean
- char: Ocupa 2 bytes y solo puede almacenar 1 dígito, debemos usar comillas simples en vez de comillas dobles.
- boolean: Son un tipo de dato lógico, solo aceptan los valores true y false. También ocupa 2 bytes y almacena únicamente 1 dígito.
Seguro te diste cuenta que siempre debemos escribir el tipo de dato de nuestras variables antes de definir su nombre y valor. Pero esto cambia a partir de Java 10: solo debemos escribir la palabra reservada var y Java definirá el tipo de dato de nuestras variables automáticamente:

```java
var salary = 1000; // INT
var pension = salary * 0.03; // DOUBLE
var totalSalary = salary - pension; // DOUBLE
```
Recuerda que esto solo funciona con versiones superiores a Java 10.

# Operadores de Asignacion, Incremento y Decremento
#### Operadores de asignacion
- +=: a += b es equivalente a a = a + b.
- -=: a -= b es equivalente a a = a - b.
- *=: a *= b es equivalente a a = a * b.
- /=: a /= b es equivalente a a = a / b.
- %=: a %= b es equivalente a a = a % b.
#### Operadores de incremento
- ++: i++ es equivalente a i = i + 1.
- --: i-- es equivalente a i = i - 1.
Podemos usar estos operadores de forma prefija (++i) o postfija (i++). La diferencia está en qué operación se ejecuta primero:
```java
int vidas = 5;
int regalo = 100 + vidas++;

System.out.println("Regalo: " + regalo + ", vidas: " + vidas);
// Regalo: 105, vidas: 6

// Incremento prefijo:
int vidas = 5;
int regalo = 100 + ++vidas;

System.out.println("Regalo: " + regalo + ", vidas: " + vidas);
// Regalo: 106, vidas: 6
```