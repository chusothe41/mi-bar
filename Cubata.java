public class Cubata
{
    // Cantidad de alcohol del cubata
    private int alcohol;
    // Nombre de la copa
    private String nombre;

    /**
     * Constructor for objects of class Cubata
     */
    public Cubata(int alcohol, String nombre)
    {
        // Valor del alcohol depende de un parametro
        this.alcohol = alcohol;
        this.nombre = nombre;
    }

    /**
     * Metodo que devuelve la cantidad de alcohol
     */
    public int getAlcohol()
    {
        // Retorna la cantidad de alcohol dispuesta en el constructor
        return alcohol;
    }
    
    public String getNombre()
    {
        // Retorna el nombre de la copa
        return nombre;
    }
}
