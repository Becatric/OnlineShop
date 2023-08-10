package com.project.OnlineShop.Entity;

import com.project.OnlineShop.Entity.Product;
import jakarta.persistence.*;

@Entity
public class Filter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "mobilier")
    private boolean mobilier;
    @Column(name = "CorpIluminat")
    private boolean CorpIluminat;
    @Column(name = "Covoare")
    private boolean Covoare;
    @Column(name = "Animalute")
    private boolean Animalute;
    @Column(name = "Utilitare")
    private boolean Utilitare;
    @Column(name = "Dormitor")
    private boolean Dormitor;
    @Column(name = "Living")
    private boolean Living;
    @Column(name = "Bucatarie")
    private boolean Bucatarie;
    @Column(name = "Baie")
    private boolean Baie;
    @Column(name = "Gradina")
    private boolean Gradina;
    @Column(name = "Negru")
    private boolean Negru;
    @Column(name = "Alb")
    private boolean Alb;
    @Column(name = "Multicolor")
    private boolean Multicolor;
    @Column(name = "Monocolor")
    private boolean Monocolor;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Filter(){};
    public Filter(boolean mobilier, boolean corpIluminat, boolean covoare, boolean animalute, boolean utilitare, boolean dormitor, boolean living, boolean bucatarie, boolean baie, boolean gradina, boolean negru, boolean alb, boolean multicolor, boolean monocolor) {
        this.mobilier = mobilier;
        CorpIluminat = corpIluminat;
        Covoare = covoare;
        Animalute = animalute;
        Utilitare = utilitare;
        Dormitor = dormitor;
        Living = living;
        Bucatarie = bucatarie;
        Baie = baie;
        Gradina = gradina;
        Negru = negru;
        Alb = alb;
        Multicolor = multicolor;
        Monocolor = monocolor;
    }

    public int getId() {
        return id;
    }

    public boolean isMobilier() {
        return mobilier;
    }

    public boolean isCorpIluminat() {
        return CorpIluminat;
    }

    public boolean isCovoare() {
        return Covoare;
    }

    public boolean isAnimalute() {
        return Animalute;
    }

    public boolean isUtilitare() {
        return Utilitare;
    }

    public boolean isDormitor() {
        return Dormitor;
    }

    public boolean isLiving() {
        return Living;
    }

    public boolean isBucatarie() {
        return Bucatarie;
    }

    public boolean isBaie() {
        return Baie;
    }

    public boolean isGradina() {
        return Gradina;
    }

    public boolean isNegru() {
        return Negru;
    }

    public boolean isAlb() {
        return Alb;
    }

    public boolean isMulticolor() {
        return Multicolor;
    }

    public boolean isMonocolor() {
        return Monocolor;
    }

    public Product getProduct() {
        return product;
    }

    public void setMobilier(boolean mobilier) {
        this.mobilier = mobilier;
    }

    public void setCorpIluminat(boolean corpIluminat) {
        CorpIluminat = corpIluminat;
    }

    public void setCovoare(boolean covoare) {
        Covoare = covoare;
    }

    public void setAnimalute(boolean animalute) {
        Animalute = animalute;
    }

    public void setUtilitare(boolean utilitare) {
        Utilitare = utilitare;
    }

    public void setDormitor(boolean dormitor) {
        Dormitor = dormitor;
    }

    public void setLiving(boolean living) {
        Living = living;
    }

    public void setBucatarie(boolean bucatarie) {
        Bucatarie = bucatarie;
    }

    public void setBaie(boolean baie) {
        Baie = baie;
    }

    public void setGradina(boolean gradina) {
        Gradina = gradina;
    }

    public void setNegru(boolean negru) {
        Negru = negru;
    }

    public void setAlb(boolean alb) {
        Alb = alb;
    }

    public void setMulticolor(boolean multicolor) {
        Multicolor = multicolor;
    }

    public void setMonocolor(boolean monocolor) {
        Monocolor = monocolor;
    }

    @Override
    public String toString() {
        return "Filter{" +
                "id=" + id +
                ", mobilier=" + mobilier +
                ", CorpIluminat=" + CorpIluminat +
                ", Covoare=" + Covoare +
                ", Animalute=" + Animalute +
                ", Utilitare=" + Utilitare +
                ", Dormitor=" + Dormitor +
                ", Living=" + Living +
                ", Bucatarie=" + Bucatarie +
                ", Baie=" + Baie +
                ", Gradina=" + Gradina +
                ", Negru=" + Negru +
                ", Alb=" + Alb +
                ", Multicolor=" + Multicolor +
                ", Monocolor=" + Monocolor +
                ", product=" + product +
                '}';
    }
}