public class Main {
    public static void main(String[] args) throws Exception {
        //Upcast
        Funcionario funcionario = new Funcionario();
        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();

        //Downcast
        Vendedor vendedor_ = (Vendedor)new Funcionario();
    }
}
