/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;

public class V2beta1ContainerResourceMetricSourceBuilder
    extends V2beta1ContainerResourceMetricSourceFluentImpl<
        V2beta1ContainerResourceMetricSourceBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource,
        V2beta1ContainerResourceMetricSourceBuilder> {
  public V2beta1ContainerResourceMetricSourceBuilder() {
    this(false);
  }

  public V2beta1ContainerResourceMetricSourceBuilder(Boolean validationEnabled) {
    this(new V2beta1ContainerResourceMetricSource(), validationEnabled);
  }

  public V2beta1ContainerResourceMetricSourceBuilder(
      V2beta1ContainerResourceMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta1ContainerResourceMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2beta1ContainerResourceMetricSource(), validationEnabled);
  }

  public V2beta1ContainerResourceMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource instance) {
    this(fluent, instance, false);
  }

  public V2beta1ContainerResourceMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withContainer(instance.getContainer());

    fluent.withName(instance.getName());

    fluent.withTargetAverageUtilization(instance.getTargetAverageUtilization());

    fluent.withTargetAverageValue(instance.getTargetAverageValue());

    this.validationEnabled = validationEnabled;
  }

  public V2beta1ContainerResourceMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource instance) {
    this(instance, false);
  }

  public V2beta1ContainerResourceMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withContainer(instance.getContainer());

    this.withName(instance.getName());

    this.withTargetAverageUtilization(instance.getTargetAverageUtilization());

    this.withTargetAverageValue(instance.getTargetAverageValue());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource build() {
    V2beta1ContainerResourceMetricSource buildable = new V2beta1ContainerResourceMetricSource();
    buildable.setContainer(fluent.getContainer());
    buildable.setName(fluent.getName());
    buildable.setTargetAverageUtilization(fluent.getTargetAverageUtilization());
    buildable.setTargetAverageValue(fluent.getTargetAverageValue());
    return buildable;
  }
}
