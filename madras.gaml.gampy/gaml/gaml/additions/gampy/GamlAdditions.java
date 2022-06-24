package gaml.additions.gampy;

import msi.gama.util.matrix.*;
import msi.gama.util.graph.*;
import msi.gama.metamodel.shape.*;
import java.lang.*;
import msi.gama.util.*;
import msi.gama.util.path.*;
import msi.gama.extensions.messaging.*;
import msi.gaml.compilation.*;
import msi.gama.util.file.*;
import msi.gaml.architecture.finite_state_machine.*;
import msi.gama.common.interfaces.*;
import msi.gaml.architecture.user.*;
import msi.gama.kernel.simulation.*;
import msi.gama.outputs.*;
import msi.gaml.species.*;
import msi.gaml.architecture.weighted_tasks.*;
import msi.gama.kernel.experiment.*;
import  msi.gama.metamodel.shape.*;
import msi.gaml.extensions.multi_criteria.*;
import msi.gaml.types.*;
import msi.gama.kernel.batch.*;
import msi.gama.kernel.root.*;
import java.util.*;
import msi.gaml.factories.*;
import msi.gaml.skills.*;
import msi.gama.util.tree.*;
import msi.gama.outputs.layers.*;
import msi.gama.runtime.*;
import msi.gaml.statements.test.*;
import msi.gama.metamodel.agent.*;
import msi.gaml.expressions.*;
import msi.gama.metamodel.topology.*;
import msi.gaml.statements.draw.*;
import msi.gaml.descriptions.*;
import msi.gaml.variables.*;
import msi.gaml.operators.*;
import msi.gama.runtime.exceptions.*;
import msi.gaml.statements.*;
import msi.gama.kernel.model.*;
import msi.gama.metamodel.population.*;
import msi.gama.outputs.layers.charts.*;
import msi.gaml.architecture.reflex.*;
import msi.gaml.operators.Random;
import msi.gaml.operators.Maths;
import msi.gaml.operators.Points;
import msi.gaml.operators.Spatial.Properties;
import msi.gaml.operators.System;
import static msi.gaml.operators.Cast.*;
import static msi.gaml.operators.Spatial.*;
import static msi.gama.common.interfaces.IKeyword.*;
@SuppressWarnings({ "rawtypes", "unchecked", "unused" })

public class GamlAdditions extends msi.gaml.compilation.AbstractGamlAdditions {
	public void initialize() throws SecurityException, NoSuchMethodException {
	initializeVars();
	initializeAction();
	initializeSkill();
}public void initializeVars()  {
_var(madras.gaml.gampy.GampySkills.class,desc(4,S("type","4","name","model_path")),(s,a,t,v)->t==null? null:((madras.gaml.gampy.GampySkills)t).getModelPath(a),null,(s,a,t,v)->{if (t != null) ((madras.gaml.gampy.GampySkills) t).setModelPath(s,a, (String) v); return null; });
_var(madras.gaml.gampy.GampySkills.class,desc(4,S("type","4","name","model_type")),(s,a,t,v)->t==null? null:((madras.gaml.gampy.GampySkills)t).getModelType(a),null,(s,a,t,v)->{if (t != null) ((madras.gaml.gampy.GampySkills) t).setModelType(a, (String) v); return null; });
}public void initializeAction() throws SecurityException, NoSuchMethodException {
_action(new GamaHelper("predict",madras.gaml.gampy.GampySkills.class,(s,a,t,v)->((madras.gaml.gampy.GampySkills) t).primPredict(s)),desc(PRIM,new Children(_arg("input_value",5,F),_arg("nb_features",1,F),_arg("input_var",4,T),_arg("output_var",4,T)),NAME,"predict",TYPE,Ti(LI),VIRTUAL,FALSE),madras.gaml.gampy.GampySkills.class.getMethod("primPredict",SC));
}public void initializeSkill()  {
_skill("gampy",madras.gaml.gampy.GampySkills.class,AS);
}
}