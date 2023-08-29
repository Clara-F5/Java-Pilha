public class TesteConexao {
    public static void main(String[] args) throws Exception {


//      Versão Normal da estrutura Try...Catch
/*      Conexao con = null;
         try{
           con = new Conexao();
           con.leDados();
          con.fecha();
      } catch(IllegalStateException ex){
            System.out.println("Deu erro na conexão");
        } finally {
           con.fecha();
        }
*/

// Versão simplificada (Try-with-resources)- necessário implementar o autoClose na classe usada

        try(Conexao conexao = new Conexao() ){
            conexao.leDados();
        } catch(IllegalStateException ex){
            System.out.println("Deu erro na conexão");
        }


    }
}
