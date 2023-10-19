package cyp2;

class Gorra {
    private String color;
    private boolean defectuosa;

    public Gorra(String color, boolean defectuosa) {
        this.color = color;
        this.defectuosa = defectuosa;
    }

    public String getColor() {
        return color;
    }

    public boolean tieneDefectos() {
        return defectuosa;
    }
}
