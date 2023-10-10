package app;

class ParametrosInvalidosException extends Exception{
    private static final long serialVersionUID = 1L;

    ParametrosInvalidosException() {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
    }
   
}