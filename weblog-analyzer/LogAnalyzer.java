/**
 * Read web server data and analyse hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version    2016.02.29
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer()
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader();
    }

    public LogAnalyzer(String fileName)
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader(fileName);
        analyzeHourlyData();
    }
    
    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }
    
    public int numberOfAccesses()
    {
     int total = 0 ;
     for(int i: hourCounts){
         total += i;
     }
      return total;
    }
    
    public int busiestHour()
    {
     int hrBzy = 0;
     for(int d=0; d<(hourCounts.length); d++){
         if(hourCounts[d] > hourCounts[hrBzy])
            hrBzy = d;
     }
      return hrBzy;
    }

    public int busy2Hours()
    {
     int bzy2 = 0;
     for(int j=1; j<(hourCounts.length); j++){
         if((hourCounts[j-1]+hourCounts[j]) > (hourCounts[bzy2] + hourCounts[bzy2+1]))
            bzy2 = j-1;
     }
      return bzy2;
    }
    
    public int quietestHour()
    {
     int hrQ = 0;
     for(int k=0; k<(hourCounts.length); k++){
         if(hourCounts[k] < hourCounts[hrQ])
            hrQ = k;
     }
      return hrQ;
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        for(int hour = 0; hour < hourCounts.length; hour++) {
            System.out.println(hour + ": " + hourCounts[hour]);
        }
    }
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
}
