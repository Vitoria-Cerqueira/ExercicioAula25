package ExercicioUm;

public class Azul {

        private int tonalidade; // letra D
        public static String cor = "ExercicioDuas.Azul";
        public Azul(int tonalidade) { // letra E
            this.tonalidade = tonalidade;
        }
        public int getTonalidade() {
            return tonalidade;
        }
        public void setTonalidade(int tonalidade) { // LETRA D
            this.tonalidade = tonalidade;
        }
        public void tornarMaisEscuro() { // mexo no numero do meu azul
            tonalidade++;
        }
        void calcularTonalidade() {
            if (tonalidade == 1){
                System.out.println(cor + " Clara " + getTonalidade());
            }else if (tonalidade == 2){
                System.out.println(cor + " Medio " + getTonalidade());
            }else if (tonalidade == 3){
                System.out.println(cor + " Escuro " + getTonalidade());
            }
        }
        public void TornarTonalidadeMaisEscura(int acao) { // tornar mais escura a cor
            tonalidade += acao;
        }
    }

