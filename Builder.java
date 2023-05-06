/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palntworldstage2;
/**
 *
 * @author noufz
 */
       public class Builder 
       {
        String namePlant;
        Size sizePlant;
        double pricePlant;

        public Builder namePlant(String namePlant) {
            this.namePlant = namePlant;
            return this;
        }

        public Builder sizePlant(Size sizePlant) {
            this.sizePlant = sizePlant;
            return this;
        }

        public Builder pricePlant(double pricePlant) {
            this.pricePlant = pricePlant;
            return this;
        }
        public plant build() {
            return new plant(this);
        }
    }
