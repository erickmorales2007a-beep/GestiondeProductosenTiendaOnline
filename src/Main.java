public class Main {
    public static void main(String[] args) {
        ProductoDigital[] inventario = new ProductoDigital[] {
                new ProductoDigital("Licencia IDE JetBrains", 149.99, 50),
                new ProductoDigital("Curso Evolve English Pack", 85.00, 20),
                new ProductoDigital("Suscripción Antivirus", 29.90, 100)
        };

        System.out.println("=== REPORTES ===");
        for (int i = 0; i < inventario.length; i++) {
            inventario[i].mostrarInfo();
        }

        System.out.println("\n=== APLICANDO DESCUENTO GENERAL DEL 10% ===");
        for (int i = 0; i < inventario.length; i++) {
            double nuevoPrecio = inventario[i].getPrecio() * 0.90;
            inventario[i].setPrecio(nuevoPrecio);
        }

        System.out.println("\n=== INVENTARIO CON NUEVOS PRECIOS ===");
        for (int i = 0; i < inventario.length; i++) {
            inventario[i].mostrarInfo();
        }
    }
}