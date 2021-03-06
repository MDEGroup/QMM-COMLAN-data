# Structure of the repository
* <b>analysis-outcome</b> contains metric reports that are used in evaluation process;
* quality metamodel and both instances (i.e. metamodels and transformation) are stored in <b>quality-models</b>;
* <b>questionnaire-response</b> contains the qualitative analysis results. It inludes the responses of evaluators;
* All supporting tools are stored in <b>tool</b>;
* <b>validation-subjects</b> stores transformation and metamodel corpus that we used in the evaluation process.

# Playing with quality models
[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/QDXaKHgeVM8/0.jpg)](https://www.youtube.com/watch?v=QDXaKHgeVM8)

# Process Overview
In [1] an automated quality assessment approach for modelling artefacts was proposed. The approach enables the specification of custom quality models consisting of hierarchically organized quality attributes, whose evaluation depends on metrics specifically conceived and applied on the modelling artefacts to be analysed. A domain-specific language is proposed to specify how quality attributes and metrics have to be aggregated. An operative environment is also provided to apply the defined quality models on actual modelling artefacts enabling their automated quality assessment. A validation of the approach has been executed by defining and applying arbitrary quality models (taken from the literature) to a large scale of heterogeneous artefacts, such as metamodels and transformations, retrieved from public repositories. The proposed approach relies on the process summarized in this picture:

![alt tag](https://github.com/MDEGroup/QMM-COMLAN-data/blob/master/process.jpg)


# Data Analysis
The approach has been extended and validated against a data corpus consisting of 2’380 metamodels and 22 transformations. This repository collects the defined quality models, the analysed artefacts, and the outcome of the performed analysis. For each quality attribute specified in the evaluated quality model, the Automated Quality Assessment Engine, creates an Excel file, where the evaluated artefacts are listed (e.g. functionality_graphs, reusabilty_graphs, etc). In these files the rows are related to the analysed artefacts and the columns report the evaluation: the first column contains the calculated quality attribute (e.g., functionality) followed by the list of all the metrics applied to compute the subject quality attribute (e.g., NAM, ADI, etc.). In the same sheet, graphs are available to easily spot the trends of the quality attributes in relation to the selected metrics.

# Content of the repository
* Analysis-outcome: it contains the excel files outcome of the validation process
* Quality-models: it contains examples of quality models executed for retrieving the exposed data
* Tools: it contains the eclipse editors for the quality models plus the evaluation engine including setup instructions
* Validation-subject: it contains the subject artifacts of the validation proposed in the paper

# References
[1] Francesco Basciani, Juri Di Rocco, Davide Di Ruscio, Ludovico Iovino and Alfonso Pierantonio, <b>A Customizable Approach for the Automated Quality Assessment of Modelling Artefacts</b>, in: 10th International Conference on the Quality of Information and Communications Technology (QUATIC 2016), Lisbon, Portugal, IEEE CPS, 2016
http://reposto.di.univaq.it/aigon2/index.php/attachments/single/199
