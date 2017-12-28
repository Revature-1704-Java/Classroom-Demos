import { Injectable } from '@angular/core';
import { Product } from './product';

@Injectable()
export class ProductService {

  getProducts(): Product[] {
    return products;
  }

  getProductById(productId: number): Product {
    return products.find(p => p.id === productId);
  }

}

const products = [
  {
    'id': 1,
    'title': 'Touhou 6',
    'price': 15,
    'rating': 'E',
    'shortDescription': 'This is a short description',
    'description': 'Lorem ipsum dolor sit amet',
    categories: ['Action']
  },
  {
    'id': 2,
    'title': 'Dance Dance Revolution',
    'price': 1000,
    'rating': 'E',
    'shortDescription': 'This is a short description',
    'description': 'Lorem ipsum dolor sit amet',
    categories: ['Action']
  },
  {
    'id': 3,
    'title': 'Silent Hill',
    'price': 24.99,
    'rating': 'M',
    'shortDescription': 'This is a short description',
    'description': 'Lorem ipsum dolor sit amet',
    categories: ['Horror']
  },
  {
    'id': 4,
    'title': 'Flappy Bird',
    'price': 15.99,
    'rating': 'E',
    'shortDescription': 'This is a short description',
    'description': 'Lorem ipsum dolor sit amet',
    categories: ['Action', 'Horror']
  },
  {
    'id': 5,
    'title': 'Final Fantasy',
    'price': 4.99,
    'rating': 'T',
    'shortDescription': 'This is a short description',
    'description': 'Lorem ipsum dolor sit amet',
    categories: ['RPG']
  }
];
