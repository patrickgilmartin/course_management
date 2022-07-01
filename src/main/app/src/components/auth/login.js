import React from "react";
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';


const Login = () => (
    <Container className="my-auto">
        <Row>
            <Col xs lg="4">
                <Form className="d-flex flex-column">
                    <div id="login_header" className="d-flex flex-row">
                        <p className="me-2">EagleID</p>
                        <img src="/eagle_claw-72x72.png" alt="" />
                    </div>
                    <Form.Group className="mb-3" controlId="formUsername">
                        <Form.Control type="text" placeholder="Username" />
                    </Form.Group>
                    <Form.Group className="mb-3" controlId="formBasicPassword">
                        <Form.Control type="password" placeholder="Password" />
                    </Form.Group>
                    <Button variant="primary" type="submit">
                        Submit
                    </Button>
                </Form>
            </Col>
        </Row>
    </Container>
);

export default Login;