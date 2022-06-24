# GamPy: A skill for integration of Python-based DL models. 
The plugin is tested to work stably with Keras (.h5 format) and Pytorch (.onnx format) framework. Other formats may potentially result in a problem. At the moment, the skill accepts input as a matrix (list of list), not a tensor, so higher dimension of input data will be not ready.

### Attributes:
- model_type: type of DL moodel (value: “keras”, “pytorch”)
- model_path: path to the model

### Action:
- predict: make prediction with
- input_value (list of list): input value of test data.
- nb_features: number of feature each test data.
- input_var (if torch model): name of input variable in torch model.
- output_var  (if torch model): name of output variable in torch model.
