# Una más por favor

Enlace al repositorio: https://github.com/Silvia452/UnamasPorFavor

## 1. Dado el siguiente fragmento de código C:
static final double N = 2; static final double PREC = 1e-6;
static double f (double x)
{ return x*x-N; }
static double bisect (double min, double max) { double med = (min+max)/2;
if (max-min<PREC) { return med;
} else if (f(min)*f(med)<0) { return bisect (min,med);
} else {
return bisect (med,max); }}

a) ¿Qué calcula la llamada a la función recursiva bisect(0,N)? Si cambiamos el valor de N, ¿qué estaríamos calculando? ¿Y si cambiásemos la función f(x)?

La llamada de función recursiva bisect(0,N) calcula la raíz cuadrada de N utilizando el método de bisección. 

Si cambiamos el valor de N, la función de bisect calcula la raíz cuadrada del nuevo valor de N. Por ejemplo, si cambiamos N a 4, la función de bisección calcula la raíz cuadrada de 4. 

Si cambiamos el función f(x) calcula la función de división divide la raíz de la nueva función f(x) en dos mitades. Sin embargo, para que el método de bisección funcione correctamente, la nueva función f(x) debe ser continua y cambiar de signo en el intervalo [min, max]. Si la nueva función no cumple estas condiciones, es posible que la función de bisección no converja o dé resultados incorrectos. 

b) Implemente un algoritmo iterativo equivalente.

## 2. Dado el siguiente algoritmo recursivo:
void f(int num, int div)
{
if (num>1) {
if ((num%div) == 0) { System.out.println(div); f(num/div,div);
} else {
f(num,div+1); }
} }

a) Dado un número cualquiera x, ¿qué nos muestra por pantalla la llamada a la función recursiva f(x,2)? ¿Cuál sería un nombre más adecuado para la función f?


b) Implemente un algoritmo iterativo y uno implementado mediante expresiones lambda equivalentes.
