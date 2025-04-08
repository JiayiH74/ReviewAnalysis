import java.util.ArrayList;

public class ReviewAnalysis
{
  private Review[] allReviews;

  public ReviewAnalysis(Review[] reviews)
  {
    allReviews = reviews;
  }

  public double getAverageRating()
  {
    double sum = 0;
    for(Review r : allReviews)
    {
      sum += r.getRating();
    }
    return sum/allReviews.length;
  }

  public ArrayList<String> collectComments()
  {
    ArrayList<String> list = new ArrayList<String>();
    for(int i = 0; i < allReviews.length; i++)
    {
      Review comment = allReviews[i];
      String hyphened = "";
      if(comment.getComment().contains("!"))
      {
        hyphened = i + "-" + comment.getComment();
        list.add(hyphened);
      }
    }
    return list;
  }
}
    
