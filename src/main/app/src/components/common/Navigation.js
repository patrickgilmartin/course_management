import Navbar from 'react-bootstrap/Navbar';
import Nav from 'react-bootstrap/Nav';
import Container from 'react-bootstrap/Container';

const Navigation = () => (
    <Navbar bg="primary" variant="dark" expand="lg">
        <Container fluid>
            <Navbar.Brand href="#home" className='d-flex'>
                <img
                    alt=""
                    src="/logo.svg"
                    width="90"
                    height="90"
                    className="d-inline-block align-top"
                />{' '}
                <div id='institue_name' className='d-flex flex-column justify-content-center ms-2'>
                    <p className='mb-0'>Institute of</p>
                    <p className='mb-0'>Education</p>
                </div>
            </Navbar.Brand>
            <Navbar.Toggle aria-controls="navbarScroll" />
            <Navbar.Collapse id="navbarScroll" className='d-flex flex-column align-items-end'>
                <Nav className="my-2 my-lg-0 " style={{ maxHeight: '100px' }} navbarScroll>
                    <Container className='d-flex flex-column' fluid>
                        <Nav.Link href="#action1">Home</Nav.Link>
                        <Nav.Link href="#action2">Link</Nav.Link>
                        <Nav.Link href="#">Link</Nav.Link>
                    </Container>
                </Nav>
            </Navbar.Collapse>
        </Container>
    </Navbar>
)

export default Navigation;