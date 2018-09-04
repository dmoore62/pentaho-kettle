package org.pentaho.di.core.plugins;

import org.pentaho.di.core.exception.KettlePluginException;
import org.pentaho.di.trans.step.StepMetaInterface;

import java.lang.annotation.Annotation;
import java.util.Map;

@PluginMainClassType( StepMetaInterface.class )
@PluginAnnotationType( OverrideStep.class )
public class OverrideStepPluginType extends BasePluginType implements PluginTypeInterface {

  private static OverrideStepPluginType overrideStepPluginType;

  protected OverrideStepPluginType() {
    super( OverrideStep.class, "OVERRIDE_STEP", "Override step");
    populateFolders( "overridesteps" );
  }

  public static OverrideStepPluginType getInstance() {
    if ( overrideStepPluginType == null ) {
      overrideStepPluginType = new OverrideStepPluginType();
    }
    return overrideStepPluginType;
  }

  @Override
  protected void registerXmlPlugins() throws KettlePluginException {

  }

  @Override
  protected String extractID(Annotation annotation) {
    return ( (OverrideStep) annotation ).id();
  }

  @Override
  protected String extractName(Annotation annotation) {
    return ( (OverrideStep) annotation ).name();
  }

  @Override
  protected String extractDesc(Annotation annotation) {
    return ( (OverrideStep) annotation ).description();
  }

  @Override
  protected String extractCategory(Annotation annotation) {
    return null;
  }

  @Override
  protected String extractImageFile(Annotation annotation) {
    return null;
  }

  @Override
  protected boolean extractSeparateClassLoader(Annotation annotation) {
    return false;
  }

  @Override
  protected String extractI18nPackageName(Annotation annotation) {
    return null;
  }

  @Override
  protected String extractDocumentationUrl(Annotation annotation) {
    return null;
  }

  @Override
  protected String extractSuggestion(Annotation annotation) {
    return null;
  }

  @Override
  protected String extractCasesUrl(Annotation annotation) {
    return null;
  }

  @Override
  protected String extractForumUrl(Annotation annotation) {
    return null;
  }

  @Override
  protected void addExtraClasses(Map<Class<?>, String> map, Class<?> aClass, Annotation annotation) {

  }
}
