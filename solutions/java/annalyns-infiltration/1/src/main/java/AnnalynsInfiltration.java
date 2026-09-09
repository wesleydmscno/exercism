class AnnalynsInfiltration {

  public static boolean canFastAttack(boolean knightIsAwake) {
    return !knightIsAwake;
  }

  public static boolean canSpy(
    boolean knightIsAwake,
    boolean archerIsAwake,
    boolean prisonerIsAwake
  ) {
    return knightIsAwake || archerIsAwake || prisonerIsAwake;
  }

  public static boolean canSignalPrisoner(
    boolean archerIsAwake,
    boolean prisonerIsAwake
  ) {
    return !archerIsAwake && prisonerIsAwake;
  }

  public static boolean canFreePrisoner(
    boolean knightIsAwake,
    boolean archerIsAwake,
    boolean prisonerIsAwake,
    boolean petDogIsPresent
  ) {
    return (
      !archerIsAwake &&
      ((prisonerIsAwake && !knightIsAwake && !petDogIsPresent) ||
        petDogIsPresent)
    );
  }
}

// P, K, A, D
// D + (P, !P) + (K, !K) + !A = true
// !D + P + !K + !A = true
//
// thinking...

//
