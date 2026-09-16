class BirdWatcher {

  private final int[] birdsPerDay;

  public BirdWatcher(int[] birdsPerDay) {
    this.birdsPerDay = birdsPerDay.clone();
  }

  public static int[] getLastWeek() {
    int[] lastWeekCounts = { 0, 2, 5, 3, 7, 8, 4 };
    return lastWeekCounts;
  }

  public int getToday() {
    return this.birdsPerDay[this.birdsPerDay.length - 1];
  }

  public void incrementTodaysCount() {
    int todayIndex = this.birdsPerDay.length - 1;
    this.birdsPerDay[todayIndex]++;
  }

  public boolean hasDayWithoutBirds() {
    for (int count : this.birdsPerDay) {
      if (count == 0) return true;
    }

    return false;
  }

  public int getCountForFirstDays(int numberOfDays) {
    int visitingCount = 0;

    for (int i = 0; i < numberOfDays && i < this.birdsPerDay.length; i++) {
      visitingCount += this.birdsPerDay[i];
    }

    return visitingCount;
  }

  public int getBusyDays() {
    int countBusy = 0;

    for (int count : this.birdsPerDay) {
      if (count >= 5) countBusy++;
    }

    return countBusy;
  }
}
