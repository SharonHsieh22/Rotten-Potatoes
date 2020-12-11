public class RottenPotato {

    public static void main(String[] args) {

        int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };

        System.out.println("Movie zero's average rating: " + movieAvgRating(ratings, 0));                    
        System.out.println("Movie one's average rating: " + movieAvgRating(ratings, 1));    
        System.out.println("Reviewer zero's average rating: " + reviewerAvgRating(ratings, 0));    
        System.out.println("Reviewer one's average rating: " + reviewerAvgRating(ratings, 1));
        System.out.println("Average rating for all movies in 2018: " + avgRating2018(ratings));    
        System.out.println("Hardest reviewer is #" + hardestReviewer2018(ratings));
        System.out.println("Worst movie is #" + worstMovie2018(ratings));
    }

    //Question 1
    public static int movieAvgRating(int[][] ratings, int movie) {
       int sum = 0;
       int num = 0;
       for(int r = 0; r<ratings.length; r++) {
           sum += ratings[r][movie];
           num++;
        } 
       return sum/num;
    }

    //Question 2
    public static int reviewerAvgRating(int[][] ratings,int reviewer) {
       int sum = 0;
       int num = 0;
       for(int c = 0; c<ratings[0].length; c++) {
          sum += ratings[reviewer][c]; 
          num++;
        }
       return sum/num;
    }

    //Question 3
    public static int avgRating2018(int[][] ratings) {
       int sum = 0;
       int num = 0;
       for(int r = 0; r<ratings.length; r++) {
          for(int c = 0; c<ratings[0].length; c++) {
             sum += ratings[r][c]; 
             num++;
            }
        }
       return sum/num;
    }

    //Question 4
    public static int hardestReviewer2018(int[][] ratings) {
       int sum = 0;
       int num = 0;
       int ave = 0;
       int min = 10;
       int ans = 0;
       for(int r = 0; r<ratings.length; r++) {
          for(int c = 0; c<ratings[0].length; c++) {
             sum = 0;
             num = 0;
             sum += ratings[r][c]; 
             num++;
            }
          ave = sum/num;          
          if(ave < min) {
              min = ave;
              ans = r;
            }
        }
        
       return ans;
    }

    //question 5
    public static int worstMovie2018(int[][] ratings) {
       int sum = 0;
       int num = 0;
       int ave = 0;
       int min = 10;
       int ans = 0;
       for(int c = 0; c<ratings[0].length; c++) {
          for(int r = 0; r<ratings.length; r++) {
             sum = 0;
             num = 0;
             sum += ratings[r][c]; 
             num++;
            }
          ave = sum/num;          
          if(ave < min) {
              min = ave;
              ans = c;
            }
        }
        
       return ans;
    }   
}