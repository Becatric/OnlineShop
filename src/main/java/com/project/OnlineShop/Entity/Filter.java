package com.project.OnlineShop.Entity;

import com.project.OnlineShop.Entity.Product;
import jakarta.persistence.*;

@Entity
public class Filter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "mobilier")
    private int mobilier;
    @Column(name = "CorpIluminat")
    private int CorpIluminat;
    @Column(name = "Covoare")
    private int Covoare;
    @Column(name = "Animalute")
    private int Animalute;
    @Column(name = "Utilitare")
    private int Utilitare;
    @Column(name = "Dormitor")
    private int Dormitor;
    @Column(name = "Living")
    private int Living;
    @Column(name = "Bucatarie")
    private int Bucatarie;
    @Column(name = "Baie")
    private int Baie;
    @Column(name = "Gradina")
    private int Gradina;
    @Column(name = "Negru")
    private int Negru;
    @Column(name = "Alb")
    private int Alb;
    @Column(name = "Multicolor")
    private int Multicolor;
    @Column(name = "Monocolor")
    private int Monocolor;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Filter(){};
    public Filter(int mobilier, int corpIluminat, int covoare, int animalute, int utilitare, int dormitor, int living, int bucatarie, int baie, int gradina, int negru, int alb, int multicolor, int monocolor) {
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

    public int isMobilier() {
        return mobilier;
    }

    public int isCorpIluminat() {
        return CorpIluminat;
    }

    public int isCovoare() {
        return Covoare;
    }

    public int isAnimalute() {
        return Animalute;
    }

    public int isUtilitare() {
        return Utilitare;
    }

    public int isDormitor() {
        return Dormitor;
    }

    public int isLiving() {
        return Living;
    }

    public int isBucatarie() {
        return Bucatarie;
    }

    public int isBaie() {
        return Baie;
    }

    public int isGradina() {
        return Gradina;
    }

    public int isNegru() {
        return Negru;
    }

    public int isAlb() {
        return Alb;
    }

    public int isMulticolor() {
        return Multicolor;
    }

    public int isMonocolor() {
        return Monocolor;
    }

    public Product getProduct() {
        return product;
    }

    public void setMobilier(int mobilier) {
        this.mobilier = mobilier;
    }

    public void setCorpIluminat(int corpIluminat) {
        CorpIluminat = corpIluminat;
    }

    public void setCovoare(int covoare) {
        Covoare = covoare;
    }

    public void setAnimalute(int animalute) {
        Animalute = animalute;
    }

    public void setUtilitare(int utilitare) {
        Utilitare = utilitare;
    }

    public void setDormitor(int dormitor) {
        Dormitor = dormitor;
    }

    public void setLiving(int living) {
        Living = living;
    }

    public void setBucatarie(int bucatarie) {
        Bucatarie = bucatarie;
    }

    public void setBaie(int baie) {
        Baie = baie;
    }

    public void setGradina(int gradina) {
        Gradina = gradina;
    }

    public void setNegru(int negru) {
        Negru = negru;
    }

    public void setAlb(int alb) {
        Alb = alb;
    }

    public void setMulticolor(int multicolor) {
        Multicolor = multicolor;
    }

    public void setMonocolor(int monocolor) {
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