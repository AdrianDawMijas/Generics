public static void main(String[] args) {
    // Implementación de una clase anónima que extiende la interfaz Operation
    Operation<Integer> operacionAnonima = new Operation<Integer>() {
        @Override
        public Integer suma(Integer a) {
            return a + 10;  // Ejemplo: suma 10 a cualquier número dado
        }

        @Override
        public Integer resta(Integer a) {
            return a - 2;  // Ejemplo: resta 2 a cualquier número dado
        }

        @Override
        public Integer product(Integer a) {
            return a * 2;  // Ejemplo: multiplica por 2 cualquier número dado
        }

        @Override
        public Integer division(Integer a) {
            if (a == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }
            return a / 2;  // Ejemplo: divide entre 2 cualquier número dado
        }
    };

    // Prueba de la clase anónima
    System.out.println("Clase anónima - Suma: " + operacionAnonima.suma(10));
    System.out.println("Clase anónima - Resta: " + operacionAnonima.resta(10));
    System.out.println("Clase anónima - Producto: " + operacionAnonima.product(10));
    System.out.println("Clase anónima - División: " + operacionAnonima.division(10));
}
