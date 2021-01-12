class NoName {

  public static void runrun(){

    Runnable runner = new Runnable() {
      @Override
      public void run() {
        System.out.println("Hello Lambda!");
      }
    };

    runner.run();
  }

}