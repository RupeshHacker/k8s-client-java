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

public class V1JobConditionBuilder extends V1JobConditionFluentImpl<V1JobConditionBuilder>
    implements VisitableBuilder<
        V1JobCondition, io.kubernetes.client.openapi.models.V1JobConditionBuilder> {
  public V1JobConditionBuilder() {
    this(false);
  }

  public V1JobConditionBuilder(Boolean validationEnabled) {
    this(new V1JobCondition(), validationEnabled);
  }

  public V1JobConditionBuilder(V1JobConditionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1JobConditionBuilder(
      io.kubernetes.client.openapi.models.V1JobConditionFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1JobCondition(), validationEnabled);
  }

  public V1JobConditionBuilder(
      io.kubernetes.client.openapi.models.V1JobConditionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1JobCondition instance) {
    this(fluent, instance, false);
  }

  public V1JobConditionBuilder(
      io.kubernetes.client.openapi.models.V1JobConditionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1JobCondition instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withLastProbeTime(instance.getLastProbeTime());

    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1JobConditionBuilder(io.kubernetes.client.openapi.models.V1JobCondition instance) {
    this(instance, false);
  }

  public V1JobConditionBuilder(
      io.kubernetes.client.openapi.models.V1JobCondition instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withLastProbeTime(instance.getLastProbeTime());

    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1JobConditionFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1JobCondition build() {
    V1JobCondition buildable = new V1JobCondition();
    buildable.setLastProbeTime(fluent.getLastProbeTime());
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
}
