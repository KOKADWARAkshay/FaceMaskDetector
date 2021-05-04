/*
TEAM MASC DETECTOR
VIT BHOPAL UNIVERSITY COLLEGE PROJECT SEM 4
AKSHAY KOKADWAR 19BCE10251
AMAAN ALI KHAN 19BCE10201
 */
package org.tensorflow.lite.examples.detection.frontview;

import java.util.List;
import org.tensorflow.lite.examples.detection.tensorflowlite.Classifier.Recognition;

public interface ResultsView {
  public void setResults(final List<Recognition> results);
}
/*
TEAM MASC DETECTOR
VIT BHOPAL UNIVERSITY COLLEGE PROJECT SEM 4
AKSHAY KOKADWAR 19BCE10251
AMAAN ALI KHAN 19BCE10201
 */