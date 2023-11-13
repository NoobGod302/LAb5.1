package ro.uoradea;

abstract class Vehicle {
        private int speed;
        protected Vehicle(){
            this.speed = 0;
    }

        public abstract void speedUp();
        public int getSpeed(){
            return speed;
        }
}
