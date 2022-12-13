public class ItemSistema {
    public String nomeItem;
    public String tipoItem;
    public int complexidade = 1;

    public int CalcularQuantidadeHoras() {
        int qtdHoras = 0;

        switch (complexidade) {
            case 1:
                qtdHoras = 24;
                break;
            case 2:
                qtdHoras = 48;
                break;
            case 3:
                qtdHoras = 72;
                break;
            default:
                qtdHoras = 96;
                break;
        }

        return qtdHoras;
    }

}
