// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pbflink/request-reply.proto

package org.listware.sdk.reqreply.generated;

public interface FromFunctionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.listware.sdk.reqreply.generated.FromFunction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.org.listware.sdk.reqreply.generated.FromFunction.InvocationResponse invocation_result = 100;</code>
   */
  boolean hasInvocationResult();
  /**
   * <code>.org.listware.sdk.reqreply.generated.FromFunction.InvocationResponse invocation_result = 100;</code>
   */
  org.listware.sdk.reqreply.generated.FromFunction.InvocationResponse getInvocationResult();
  /**
   * <code>.org.listware.sdk.reqreply.generated.FromFunction.InvocationResponse invocation_result = 100;</code>
   */
  org.listware.sdk.reqreply.generated.FromFunction.InvocationResponseOrBuilder getInvocationResultOrBuilder();

  /**
   * <code>.org.listware.sdk.reqreply.generated.FromFunction.IncompleteInvocationContext incomplete_invocation_context = 101;</code>
   */
  boolean hasIncompleteInvocationContext();
  /**
   * <code>.org.listware.sdk.reqreply.generated.FromFunction.IncompleteInvocationContext incomplete_invocation_context = 101;</code>
   */
  org.listware.sdk.reqreply.generated.FromFunction.IncompleteInvocationContext getIncompleteInvocationContext();
  /**
   * <code>.org.listware.sdk.reqreply.generated.FromFunction.IncompleteInvocationContext incomplete_invocation_context = 101;</code>
   */
  org.listware.sdk.reqreply.generated.FromFunction.IncompleteInvocationContextOrBuilder getIncompleteInvocationContextOrBuilder();

  public org.listware.sdk.reqreply.generated.FromFunction.ResponseCase getResponseCase();
}
