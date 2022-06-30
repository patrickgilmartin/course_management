import { Routes, Route } from 'react-router-dom';

import Navigation from './components/common/Navigation';
import Footer from './components/common/Footer';

import Landing from './pages/landing/Landing';
import Home from './pages/home/Home';

function App() {
  return (
    <>
      <Navigation />

      <Routes>
        <Route index element={<Landing />} />
        <Route path="landing" element={<Landing />} />
        <Route path="home" element={<Home />} />
        <Route path="*" element={<p>There's nothing here: 404!</p>} />
      </Routes>

      <Footer />
    </>
  );
}

export default App;
