public class Bebedor
{
    //Nombre del bebedor
    private String nombre;
    // Cantidad maxima de alcohol que permite
    private int limiteAlcohol;
    // Cantidad de alcohol almacenada
    private int enSangre;
    //
    private boolean puedeMas;
    /**
     * Constructor que da valores iniciales
     */
    public Bebedor(int limite, String nombre)
    {
        // Damos la cantidad maxima
        limiteAlcohol = limite;
        puedeMas = true;
        enSangre = 0;
        this.nombre = nombre;
    }

    /**
     * Metodo de consumicion de copas
     */
    public void tomarCopa(Cubata tipo)
    {
        if (enSangre < limiteAlcohol)
        {
            // Llama a un objeto de la clase cubata
            enSangre = enSangre + tipo.getAlcohol();
        }
        else
        {
            //System.out.println("Ya no puedo beber mas");
            puedeMas = false;
        }
    }
    
    /**
     * 
     */
    public void pregunta(String pregunta)
    {
        String Str1 = new String("" + pregunta);
        if (puedeMas == false || Str1.contains("" + nombre))
        {
            if ((Str1.length() % 2) == 0 )
            {
                System.out.println("¡Si!");
            }
            else
            {
                System.out.println("¡No!");
            }
        }
        else
        {
            if ((Str1.length() % 2) == 0 )
            {
                System.out.println("Si");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
