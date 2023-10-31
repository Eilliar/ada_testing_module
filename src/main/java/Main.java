public class Main {
    public static void main(String[] args) {
//*  Enquanto o carro estiver desligado deve ser capaz de:
//     *  - Ligar
//                *  - Mostrar estado atual (toString())
//                * Enquanto o carro estiver ligado deve ser capaz de:
//     * - Desligar
//                * - Acelerar
//                * - Frear
//                * - Motrar estado atual
//* Regras:
//     *
//     * - Só podemos realizar as ações como acelerar e frear com o carro ligado
//     * - Só podemos desligar o carro quando ele parar totalmente (velocidadeAtual = 0)
//                * - Não existe velocidade negativa
//                * - O carro não pode passar de sua velocidade máxima

        // Gherkin
        // Given
        // When
        // Then

        // #1 Should start turned off
        Car car1 = new Car();
        System.out.println((car1.getOn() == Boolean.FALSE));

        // #2 - Start with zero velocity
        Car car2 = new Car();
        System.out.println(car2.getVelocity() == 0);

        // # 3 Start correctly
        Car car3 = new Car();
        car3.turnOn();
        System.out.println(car3.getOn() == Boolean.TRUE & car3.getVelocity() == 0);

        // #4 - Turn off correctly when turned on
        Car car4 = new Car();
        car4.turnOn();
        car4.turnOff();
        System.out.println(car4.getOn() == Boolean.FALSE);

        // #5 - Accelerate correctly a car that is on
        Car car5 = new Car();
        car5.turnOn();
        car5.accelerate(60);
        System.out.println(car5.getVelocity() == 60);

        // #6 - No negative acceleration
        Car car6 = new Car();
        car6.turnOn();
        car6.accelerate(-60);
        System.out.println(car6.getVelocity() == 0);

        // #7 - No more than max velocity
        Car car7 = new Car();
        car7.turnOn();
        car7.accelerate(151);
        System.out.println(car7.getVelocity() <= car7.getMaxVelocity());
    }
}
