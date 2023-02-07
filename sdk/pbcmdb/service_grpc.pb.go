// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package pbcmdb

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// VertexServiceClient is the client API for VertexService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type VertexServiceClient interface {
	Create(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error)
	Read(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error)
	Update(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error)
	Replace(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error)
	Remove(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error)
}

type vertexServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewVertexServiceClient(cc grpc.ClientConnInterface) VertexServiceClient {
	return &vertexServiceClient{cc}
}

func (c *vertexServiceClient) Create(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error) {
	out := new(Response)
	err := c.cc.Invoke(ctx, "/org.listware.sdk.pbcmdb.VertexService/Create", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *vertexServiceClient) Read(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error) {
	out := new(Response)
	err := c.cc.Invoke(ctx, "/org.listware.sdk.pbcmdb.VertexService/Read", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *vertexServiceClient) Update(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error) {
	out := new(Response)
	err := c.cc.Invoke(ctx, "/org.listware.sdk.pbcmdb.VertexService/Update", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *vertexServiceClient) Replace(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error) {
	out := new(Response)
	err := c.cc.Invoke(ctx, "/org.listware.sdk.pbcmdb.VertexService/Replace", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *vertexServiceClient) Remove(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error) {
	out := new(Response)
	err := c.cc.Invoke(ctx, "/org.listware.sdk.pbcmdb.VertexService/Remove", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// VertexServiceServer is the server API for VertexService service.
// All implementations must embed UnimplementedVertexServiceServer
// for forward compatibility
type VertexServiceServer interface {
	Create(context.Context, *Request) (*Response, error)
	Read(context.Context, *Request) (*Response, error)
	Update(context.Context, *Request) (*Response, error)
	Replace(context.Context, *Request) (*Response, error)
	Remove(context.Context, *Request) (*Response, error)
	mustEmbedUnimplementedVertexServiceServer()
}

// UnimplementedVertexServiceServer must be embedded to have forward compatible implementations.
type UnimplementedVertexServiceServer struct {
}

func (UnimplementedVertexServiceServer) Create(context.Context, *Request) (*Response, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Create not implemented")
}
func (UnimplementedVertexServiceServer) Read(context.Context, *Request) (*Response, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Read not implemented")
}
func (UnimplementedVertexServiceServer) Update(context.Context, *Request) (*Response, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Update not implemented")
}
func (UnimplementedVertexServiceServer) Replace(context.Context, *Request) (*Response, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Replace not implemented")
}
func (UnimplementedVertexServiceServer) Remove(context.Context, *Request) (*Response, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Remove not implemented")
}
func (UnimplementedVertexServiceServer) mustEmbedUnimplementedVertexServiceServer() {}

// UnsafeVertexServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to VertexServiceServer will
// result in compilation errors.
type UnsafeVertexServiceServer interface {
	mustEmbedUnimplementedVertexServiceServer()
}

func RegisterVertexServiceServer(s grpc.ServiceRegistrar, srv VertexServiceServer) {
	s.RegisterService(&VertexService_ServiceDesc, srv)
}

func _VertexService_Create_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Request)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(VertexServiceServer).Create(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/org.listware.sdk.pbcmdb.VertexService/Create",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(VertexServiceServer).Create(ctx, req.(*Request))
	}
	return interceptor(ctx, in, info, handler)
}

func _VertexService_Read_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Request)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(VertexServiceServer).Read(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/org.listware.sdk.pbcmdb.VertexService/Read",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(VertexServiceServer).Read(ctx, req.(*Request))
	}
	return interceptor(ctx, in, info, handler)
}

func _VertexService_Update_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Request)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(VertexServiceServer).Update(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/org.listware.sdk.pbcmdb.VertexService/Update",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(VertexServiceServer).Update(ctx, req.(*Request))
	}
	return interceptor(ctx, in, info, handler)
}

func _VertexService_Replace_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Request)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(VertexServiceServer).Replace(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/org.listware.sdk.pbcmdb.VertexService/Replace",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(VertexServiceServer).Replace(ctx, req.(*Request))
	}
	return interceptor(ctx, in, info, handler)
}

func _VertexService_Remove_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Request)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(VertexServiceServer).Remove(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/org.listware.sdk.pbcmdb.VertexService/Remove",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(VertexServiceServer).Remove(ctx, req.(*Request))
	}
	return interceptor(ctx, in, info, handler)
}

// VertexService_ServiceDesc is the grpc.ServiceDesc for VertexService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var VertexService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "org.listware.sdk.pbcmdb.VertexService",
	HandlerType: (*VertexServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Create",
			Handler:    _VertexService_Create_Handler,
		},
		{
			MethodName: "Read",
			Handler:    _VertexService_Read_Handler,
		},
		{
			MethodName: "Update",
			Handler:    _VertexService_Update_Handler,
		},
		{
			MethodName: "Replace",
			Handler:    _VertexService_Replace_Handler,
		},
		{
			MethodName: "Remove",
			Handler:    _VertexService_Remove_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "pbcmdb/service.proto",
}

// EdgeServiceClient is the client API for EdgeService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type EdgeServiceClient interface {
	Create(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error)
	Read(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error)
	Update(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error)
	Replace(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error)
	Remove(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error)
}

type edgeServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewEdgeServiceClient(cc grpc.ClientConnInterface) EdgeServiceClient {
	return &edgeServiceClient{cc}
}

func (c *edgeServiceClient) Create(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error) {
	out := new(Response)
	err := c.cc.Invoke(ctx, "/org.listware.sdk.pbcmdb.EdgeService/Create", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *edgeServiceClient) Read(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error) {
	out := new(Response)
	err := c.cc.Invoke(ctx, "/org.listware.sdk.pbcmdb.EdgeService/Read", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *edgeServiceClient) Update(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error) {
	out := new(Response)
	err := c.cc.Invoke(ctx, "/org.listware.sdk.pbcmdb.EdgeService/Update", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *edgeServiceClient) Replace(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error) {
	out := new(Response)
	err := c.cc.Invoke(ctx, "/org.listware.sdk.pbcmdb.EdgeService/Replace", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *edgeServiceClient) Remove(ctx context.Context, in *Request, opts ...grpc.CallOption) (*Response, error) {
	out := new(Response)
	err := c.cc.Invoke(ctx, "/org.listware.sdk.pbcmdb.EdgeService/Remove", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// EdgeServiceServer is the server API for EdgeService service.
// All implementations must embed UnimplementedEdgeServiceServer
// for forward compatibility
type EdgeServiceServer interface {
	Create(context.Context, *Request) (*Response, error)
	Read(context.Context, *Request) (*Response, error)
	Update(context.Context, *Request) (*Response, error)
	Replace(context.Context, *Request) (*Response, error)
	Remove(context.Context, *Request) (*Response, error)
	mustEmbedUnimplementedEdgeServiceServer()
}

// UnimplementedEdgeServiceServer must be embedded to have forward compatible implementations.
type UnimplementedEdgeServiceServer struct {
}

func (UnimplementedEdgeServiceServer) Create(context.Context, *Request) (*Response, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Create not implemented")
}
func (UnimplementedEdgeServiceServer) Read(context.Context, *Request) (*Response, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Read not implemented")
}
func (UnimplementedEdgeServiceServer) Update(context.Context, *Request) (*Response, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Update not implemented")
}
func (UnimplementedEdgeServiceServer) Replace(context.Context, *Request) (*Response, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Replace not implemented")
}
func (UnimplementedEdgeServiceServer) Remove(context.Context, *Request) (*Response, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Remove not implemented")
}
func (UnimplementedEdgeServiceServer) mustEmbedUnimplementedEdgeServiceServer() {}

// UnsafeEdgeServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to EdgeServiceServer will
// result in compilation errors.
type UnsafeEdgeServiceServer interface {
	mustEmbedUnimplementedEdgeServiceServer()
}

func RegisterEdgeServiceServer(s grpc.ServiceRegistrar, srv EdgeServiceServer) {
	s.RegisterService(&EdgeService_ServiceDesc, srv)
}

func _EdgeService_Create_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Request)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(EdgeServiceServer).Create(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/org.listware.sdk.pbcmdb.EdgeService/Create",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(EdgeServiceServer).Create(ctx, req.(*Request))
	}
	return interceptor(ctx, in, info, handler)
}

func _EdgeService_Read_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Request)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(EdgeServiceServer).Read(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/org.listware.sdk.pbcmdb.EdgeService/Read",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(EdgeServiceServer).Read(ctx, req.(*Request))
	}
	return interceptor(ctx, in, info, handler)
}

func _EdgeService_Update_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Request)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(EdgeServiceServer).Update(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/org.listware.sdk.pbcmdb.EdgeService/Update",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(EdgeServiceServer).Update(ctx, req.(*Request))
	}
	return interceptor(ctx, in, info, handler)
}

func _EdgeService_Replace_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Request)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(EdgeServiceServer).Replace(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/org.listware.sdk.pbcmdb.EdgeService/Replace",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(EdgeServiceServer).Replace(ctx, req.(*Request))
	}
	return interceptor(ctx, in, info, handler)
}

func _EdgeService_Remove_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Request)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(EdgeServiceServer).Remove(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/org.listware.sdk.pbcmdb.EdgeService/Remove",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(EdgeServiceServer).Remove(ctx, req.(*Request))
	}
	return interceptor(ctx, in, info, handler)
}

// EdgeService_ServiceDesc is the grpc.ServiceDesc for EdgeService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var EdgeService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "org.listware.sdk.pbcmdb.EdgeService",
	HandlerType: (*EdgeServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Create",
			Handler:    _EdgeService_Create_Handler,
		},
		{
			MethodName: "Read",
			Handler:    _EdgeService_Read_Handler,
		},
		{
			MethodName: "Update",
			Handler:    _EdgeService_Update_Handler,
		},
		{
			MethodName: "Replace",
			Handler:    _EdgeService_Replace_Handler,
		},
		{
			MethodName: "Remove",
			Handler:    _EdgeService_Remove_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "pbcmdb/service.proto",
}
