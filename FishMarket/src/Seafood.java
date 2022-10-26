import java.text.DecimalFormat;

public class Seafood extends FishMarket {
	DecimalFormat decimal = new DecimalFormat("0.000");
	public int index;
	public double weight;
	public double pricePound;
	public String type;
	
	public Seafood(int index, String type, double weight, double pricePound) {
		this.index = index;
		this.type = type;
		this.weight = weight;
		this.pricePound = pricePound;
	}


		
		@Override //allows the toString to have good formatting.
		public String toString() {
			return (this.seafoodIndex() + "," + this.seafoodType() + "," + this.seafoodWeight() +
					"," + this.seafoodPrice() + ",");
		}

		private String seafoodPrice() { //getters
			return decimal.format(pricePound);
		}

		private String seafoodWeight() { //getters
			return decimal.format(weight);
		}

		private String seafoodType() { //getters
			return type;
		}

		private int seafoodIndex() { //getters
			return index;

		}

	}
