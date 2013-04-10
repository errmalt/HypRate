/**
* ...
* @author shoe[box]
*/

package fr.hyperfiction;

import android.util.Log;
import com.kopfgeldjaeger.ratememaybe.RateMeMaybe;
import com.kopfgeldjaeger.ratememaybe.RateMeMaybe.OnRMMUserChoiceListener;
import org.haxe.nme.GameActivity;

public class HypRate{

	private static RateMeMaybe rmm = new RateMeMaybe( GameActivity.getInstance( ) );
	private static final String TAG = "trace";

	// -------o constructor

		/**
		* constructor
		*
		* @param
		* @return	void
		*/
		private void HypRate( ){

		}

	// -------o public

		/**
		*
		*
		* @public
		* @return	void
		*/
		static public void start(
								int minLaunches ,
								int minInitial_days ,
								int minLaunches_until_next ,
								int minDays_until_next
							){
			trace("start");
			RateMeMaybe.resetData( GameActivity.getInstance( ) );
			rmm.setPromptMinimums(0, 0, 0, 0);
			rmm.setRunWithoutPlayStore(true);
			rmm.run();
		}

		/**
		*
		*
		* @public
		* @return	void
		*/
		static public void show( ) {
			rmm.forceShow( );
		}

		/**
		*
		*
		* @public
		* @return	void
		*/
		static public void setDialog_title( String s ){
			rmm.setDialogTitle( s );
		}

		/**
		*
		*
		* @public
		* @return	void
		*/
		static public void setDialog_message( String s ){
			rmm.setDialogMessage( s );
		}

		/**
		*
		*
		* @public
		* @return	void
		*/
		static public void setPositive_text( String s ){
			rmm.setPositiveBtn( s );
		}

		/**
		*
		*
		* @public
		* @return	void
		*/
		static public void setNeutral_text( String s ){
			rmm.setNeutralBtn( s );
		}

		/**
		*
		*
		* @public
		* @return	void
		*/
		static public void setNegative_text( String s ){
			rmm.setNegativeBtn( s );
		}

	// -------o protected



	// -------o misc

		/**
		*
		*
		* @private
		* @return	void
		*/
		public static void trace( String s ){
			Log.w( TAG, "HypFacebookFrag ::: "+s );
		}
}