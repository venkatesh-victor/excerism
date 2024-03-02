
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = {0, 2, 5, 3, 7, 8, 4};
        return lastWeek;
    }

    public int getToday() {
       return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        int todaysCount = birdsPerDay[birdsPerDay.length - 1];
        todaysCount++;
        birdsPerDay[birdsPerDay.length - 1] = todaysCount;
    }

    public boolean hasDayWithoutBirds() {
        for(int i = 0; i < birdsPerDay.length; i++) {
            return birdsPerDay[i] == 0;
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if(numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }
        int count = 0;
        for(int i = 0; i < numberOfDays; i++) {
            count += birdsPerDay[i];
        }
        return count;
        
    }

    public int getBusyDays() {
        int count = 0;
        for(int i = 0; i < birdsPerDay.length; i++) {
            if(birdsPerDay[i] >= 5) count++;
        }
        return count;
    }
}
