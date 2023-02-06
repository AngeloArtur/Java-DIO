import java.util.Comparator;

class LinguagemFavorita implements Comparable<LinguagemFavorita>{

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((anoDeCriacao == null) ? 0 : anoDeCriacao.hashCode());
        result = prime * result + ((ide == null) ? 0 : ide.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LinguagemFavorita other = (LinguagemFavorita) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (anoDeCriacao == null) {
            if (other.anoDeCriacao != null)
                return false;
        } else if (!anoDeCriacao.equals(other.anoDeCriacao))
            return false;
        if (ide == null) {
            if (other.ide != null)
                return false;
        } else if (!ide.equals(other.ide))
            return false;
        return true;
    }

    public String nome;
    public Integer anoDeCriacao;
    public String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }
    
    public String getIde() {
        return ide;
    }

    @Override
    public String toString(){
        return "nome: " + nome + " | ano de criação: " + anoDeCriacao + " | ide: " + ide;
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita> {
    
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.ide.compareToIgnoreCase(l2.ide);
    }
}

class ComparatorAnoENome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = Integer.compare(l1.anoDeCriacao, l2.getAnoDeCriacao());
        if (ano != 0) {
            return ano;
        }
        return l1.nome.compareTo(l2.getNome());
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.nome.compareToIgnoreCase(l2.getNome());
        if(nome != 0) {
            return nome;
        }
        int ano = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
        if(ano != 0) {
            return ano;
        }

        return l1.ide.compareToIgnoreCase(l2.ide);
    }
}