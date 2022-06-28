package Day21;

import java.io.Serial;

public class MoodAnalysisException extends Exception {
    /**
     *
     */
    @Serial
    private static final long serialVersionUID = 1L;

    public MoodAnalysisException(String msg) {
        super(msg);
    }
}

/*import java.io.Serial;

public class MoodAnalyserException extends Exception{
	
	 @Serial
	    private static final long serialVersionUID = 1L;

	    public MoodAnalyserException(String msg) {
	        super(msg);
	    }

}*/
