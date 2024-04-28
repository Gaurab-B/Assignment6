
import java.util.Arrays;
import java.util.List;

public class RoundTripPlanner {
	// user inputs for the source and destination
	private int startCityIndex;
	private int endCityIndex;

	// Graph created using the following vertices and edges
	private WeightedGraph<String> flightNetwork;

	// array of vertices
	private String[] cities;
	// array of weighted edges [source][dest][weight]
	private int[][] connections;

	// forward and return route cities lists and cost of trip
	private List<String> forwardRoute;
	private double forwardRouteCost;
	private List<String> returnRoute;
	private double returnRouteCost;

	/*
	 * Constructor:
	 * - Assigns class variables
	 * - Invokes generateRoundTrip() method
	 */
	public RoundTripPlanner(String[] cities, int[][] connections, int startCityIndex, int endCityIndex) {
		// TO DO
	}


	/*
	 * Round trip generator:
	 * - Creates flight network graph
	 * - Updates forward trip path variable and forward trip cost
	 * - Performs necessary actions for return trip planning
	 * - Updates return trip path variable and return trip cost
	 */
	public void generateRoundTrip() {
		// TO DO
	}


	/*
	 * Trip viewer:
	 * - prints forward trip in the format:
	 * "Forward trip from A to B: A –> P –> Q –> R –> B"
	 * - prints return trip in the same format:
	 * "Return trip from B to A: B –> S –> T –> U –> A"
	 * - prints the costs for the forward trip, return trip, and total trip in the format:
	 *  "Forward route cost: 200.0"
	 *  "Return route cost: 300.0"
	 *  "Total trip cost: 500.0"
	 */
	public void printRoundTrip() {
		// TO DO
	}

	// Returns the forwardRoute class variable
	public List<String> getForwardRoute() {
		return forwardRoute;
	}

	// Returns the returnRoute class variable
	public List<String> getReturnRoute() {
		return returnRoute;
	}

	// Returns the forwardRouteCost class variable
	public double getForwardRouteCost() {
		return forwardRouteCost;
	}

	// Returns the returnRouteCost class variable
	public double getReturnRouteCost() {
		return returnRouteCost;
	}



}
