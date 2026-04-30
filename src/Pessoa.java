import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Pessoa {
  private int codigo;
  private String nome;
  private String fone;
  private String email;  

  // public Pessoa (String nome, String fone, String email){
  //   this.nome = nome;
  //   this.fone = fone;
  //   this.email = email;
  // }

  // public Pessoa (int codigo, String nome, String fone, String email){
  //   this.codigo = codigo;
  //   this.nome = nome;
  //   this.fone = fone;
  //   this.email = email;
  // }
}
