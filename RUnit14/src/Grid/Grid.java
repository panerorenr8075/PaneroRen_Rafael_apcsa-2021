package Grid;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j<cols; ++j) {
				int index = (int) (Math.random()*vals.length);
				grid[i][j] = vals[index];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int maximum = -1;
		String maxStr = "";
		for (int i = 0; i < vals.length; ++i) {
			int curCount = countVals(vals[i]);
			if (curCount > maximum) {
				maxStr = vals[i];
				maximum = curCount;
			}
		}
		return maxStr;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int counter = 0;
		for (int i = 0; i < grid.length; ++i) {
			for (int j = 0; j<grid[i].length; ++j) {
				if (grid[i][j].equals(val)) {
					counter += 1;
				}
			}
		}
		return counter;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for(int rows = 0; rows < grid.length; rows++) {
			for(int cols = 0; cols < grid[rows].length; cols++) {
				output += (grid[rows][cols] + "  " );
			}
			output += "\n";
		}
		return output;
	}
}